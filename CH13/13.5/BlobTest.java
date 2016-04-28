/**
 * <br/>��վ��<a href="http://www.crazyit.org">���Java����</a>
 * <br/>CSDN��ҳ��<a href="http://my.csdn.net/y1193329479">CSDN��ҳ</a>
 * <br/>Copyright (C), 2001-2012, Yeeu.H.Lee   (recode by yyb)
 * <br/>This program is protected by copyright laws.
 * <br/>Programe Name:
 * <br/>Date: 2016-04-28   Locate:124
 * @author yyb zgsoft_happy@126.com
 * @version 1.0
 * description��
 */
import java.util.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.FileFilter;
public class BlobTest
{
	JFrame jf = new JFrame("ͼƬ�������");
	private static Connection conn;
	private static PreparedStatement insert;
	private static PreparedStatement query;
	private static PreparedStatement queryAll;
	//����һ��DefaultListModel����
	private DefaultListModel<ImageHolder> imageModel = new DefaultListModel<>();
	private JList<ImageHolder> imageList = new JList<>(imageModel);
	private JTextField filePath = new JTextField(26);
	private JButton browserBn = new JButton("...");
	private JButton uploadBn = new JButton("�ϴ�");
	private JLabel imageLabel = new JLabel();
	//�Ե�ǰ·�������ļ�ѡ����
	JFileChooser chooser = new JFileChooser(".");
	//�����ļ�������
	ExtensionFileFilter filter = new ExtensionFileFilter();
	static {
		try
		{
			Properties props = new Properties();
			props.load(new FileInputStream("mysql.ini"));
			String driver = props.getProperty("driver");
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String pass = props.getProperty("pass");
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
			//����ִ�в����PreparedStatement����
			//�ö���ִ�в������Է����Զ����ɵ�����
			insert = conn.prepareStatement("insert into img_table values(null , ? , ?)"
				, Statement.RETURN_GENERATED_KEYS);
			//��������PreparedStatement�������ڲ�ѯָ��ͼƬ����ѯ����ͼƬ
			query = conn.prepareStatement("select img_data from img_table where img_id = ?");
			queryAll = conn.prepareStatement("select img_id , img_name from img_table");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void init() throws SQLException
	{
		//-----��ʼ���ļ�ѡ����-----
		filter.addExtension("jpg");
		filter.addExtension("jpeg");
		filter.addExtension("gif");
		filter.addExtension("png");
		filter.setDescription("ͼƬ�ļ�(*.jpg,*.jpeg,*.gif,*.png)");
		//��ֹ���ļ����ͣ������б�����ʾ�������ļ���ѡ��
		chooser.setAcceptAllFileFilterUsed(false);
		//--------��ʼ���������-----
		fillListModel();
		filePath.setEditable(false);
		//ֻ�ܵ�ѡ
		imageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JPanel jp = new JPanel();
		jp.add(filePath);
		jp.add(browserBn);
		browserBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//��ʾ�ļ��Ի���
				int result = chooser.showDialog(jf , "���ͼƬ�ļ��ϴ�");
				//����û�ѡ����APPROVE(��ͬ)��ť�����򿪣������Ч��ť
				if (result == JFileChooser.APPROVE_OPTION)
				{
					filePath.setText(chooser.getSelectedFile().getPath());
				}
			}
		});
		jp.add(uploadBn);
		uploadBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//����ϴ��ļ����ı���������
				if (filePath.getText().trim().length() > 0)
				{
					//���ƶ��ļ����浽���ݿ�
					upload(filePath.getText());
					//����ı�������
					filePath.setText("");
				}
			}
		});
		JPanel left = new JPanel();
		left.setLayout(new BorderLayout());
		left.add(new JScrollPane(imageLabel) , BorderLayout.CENTER);
		left.add(jp , BorderLayout.SOUTH);
		jf.add(left);
		imageList.setFixedCellWidth(160);
		jf.add(new JScrollPane(imageList) , BorderLayout.EAST);
		imageList.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				//���˫�����
				if (e.getClickCount() >= 2)
				{
					//ȡ��ѡ�е�List��
					ImageHolder cur = (ImageHolder)imageList.getSelectedValue();
					try
					{
						//��ʾѡ�����Ӧ��Image
						showImage(cur.getId());
					}
					catch (SQLException sqle)
					{
						sqle.printStackTrace();
					}
				}
			}
		});
		jf.setSize(620 , 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	//------����img_table�����ListModel-----------
	public void fillListModel() throws SQLException
	{
		try(
			//ִ�в�ѯ
			ResultSet rs = queryAll.executeQuery())
		{
			//���������Ԫ��
			imageModel.clear();
			//�Ѳ�ѯ��ȫ����¼��ӵ�ListModel��
			while (rs.next())
			{
				imageModel.addElement(new ImageHolder(rs.getInt(1) , rs.getString(2)));
			}
		}
	}
	//-----���ƶ�ͼƬ�������ݿ�------
	public void upload(String fileName)
	{
		//��ȡ�ļ���
		String imageName = fileName.substring(fileName.lastIndexOf('\\') + 1 , fileName.lastIndexOf('.'));
		File f = new File(fileName);
		try(
			InputStream is = new FileInputStream(f))
		{
			//����ͼƬ����
			insert.setString(1 , imageName);
			//���ö�����������
			insert.setBinaryStream(2 , is , (int)f.length());
			int affect = insert.executeUpdate();
			if (affect == 1)
			{
				//���¸���ListModel����JList��ʾ���µ�ͼƬ�б�
				fillListModel();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//-------����ͼƬID����ʾͼƬ-----
	public void showImage(int id) throws SQLException
	{
		//���ò���
		query.setInt(1 , id);
		try(
			//ִ�в�ѯ
			ResultSet rs = query.executeQuery())
		{
			if (rs.next())
			{
				//ȡ��Blob��
				Blob imgBlob = rs.getBlob(1);
				//ȥ��Blob���������
				ImageIcon icon = new ImageIcon(imgBlob.getBytes(1L , (int)imgBlob.length()));
				imageLabel.setIcon(icon);
			}
		}
	}
	public static void main(String[] args) throws SQLException
	{
		new BlobTest().init();
	}
}
//����Filter�����࣬����ʵ���ļ����˹���
class ExtensionFileFilter extends FileFilter
{
	private String description = "";
	private ArrayList<String> extensions = new ArrayList<>();
	//�Զ��巽������������ļ���չ��
	public void addExtension(String extension)
	{
		if (!extension.startsWith("."))
		{
			extension = "." + extension;
			extensions.add(extension.toLowerCase());
		}
	}
	//�������ø��ļ��������������ı�
	public void setDescription(String aDescription)
	{
		description = aDescription;
	}
	//����FileFilter�����ʵ�ֵĳ��󷽷������ظ��ļ��������������ı�
	public String getDescription()
	{
		return description;
	}
	//�̳�FileFilter�����ʵ�ֵĳ��󷽷����жϸ��ļ��������Ƿ���ܸ��ļ�
	public boolean accept(File f)
	{
		//������ļ���·����������ļ�
		if (f.isDirectory()) return true;
		//���ļ���תΪСд��ȫ��תΪСд��Ƚϣ����ں����ļ�����Сд)
		String name = f.getName().toLowerCase();
		//�������пɽ��ܵ���չ���������չ����ͬ�����ļ��Ϳɽ���
		for (String extension : extensions)
		{
			if (name.endsWith(extension))
			{
				return true;
			}
		}
		return false;
	}
}
//����һ��ImageHolder�࣬���ڷ�װͼƬ����ͼƬID
class ImageHolder
{
	//��װͼƬ��ID
	private int id;
	//��װͼƬ������
	private String name;
	public ImageHolder(){}
	public ImageHolder(int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	//id��setter��getter����
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	//name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	//��дtoString����������ͼƬ��
	public String toString()
	{
		return name;
	}
}