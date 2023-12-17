
import javax.swing.*;
import java.awt.*;

public class homepage  extends JPanel{
    private JFrame jf=new JFrame();

    public void showHomepage() {
        //初始化一个界面,并设置标题大小等属性
        homepagelistener listener=new homepagelistener(jf);

        jf.setTitle("首页");
        jf.setSize(500,500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);

        jf.setLayout(new BorderLayout());

        Dimension dim1=new Dimension(500,0);



        jf.add(this,BorderLayout.CENTER);

        //实现右边的JPanel容器界面
        JPanel jp=new JPanel();
        jp.setPreferredSize(dim1);
        jp.setBackground(Color.white);
        jf.add(jp,BorderLayout.EAST);//添加到框架布局的东边部分
        jp.setLayout(null);

        //设置选项按钮
        JLabel bq1=new JLabel("棋的类型:");
        bq1.setBounds(180,100,80,30);
        jp.add(bq1);

        String[] boxname1= {"五子棋","围棋"};
        JComboBox box1=new JComboBox(boxname1);
        box1.setBounds(260,100,100,32);
        box1.addItemListener(listener);
        jp.add(box1);

        JLabel bq2=new JLabel("棋盘大小:");
        bq2.setBounds(180,200,80,30);
        jp.add(bq2);
        String[] boxname2= new String[12];
        for(int checkerboardSize=8;checkerboardSize<=19;checkerboardSize++)
            boxname2[checkerboardSize-8]=checkerboardSize+"*"+checkerboardSize;
        JComboBox box2=new JComboBox(boxname2);
        box2.setBounds(260,200,100,30);
        box2.addItemListener(listener);
        jp.add(box2);

        String butname= "开始游戏";
        JButton button=new JButton(butname);
        button.setBounds(190,300,140,40);
        jp.add(button);

        button.addActionListener(listener);//添加发生操作的监听方法

        jf.setVisible(true);
    }

}
