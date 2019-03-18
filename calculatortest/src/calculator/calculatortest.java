package calculator;                                       //算完后必须clear再进行下次运算，否则出错
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;
public class calculatortest extends JFrame{
	public calculatortest(){
		Container c=getContentPane();     
		//2+（3*4）-5
		//创建一个容器
		StringBuffer pr=new StringBuffer();             //创建一个可变字符串，存储要输出到文本框的内容
		LinkedList<String> list1 = new LinkedList();    //创建了七个链表，四个用于分级运算，三个用于轮换、存储
		LinkedList<String> list2 = new LinkedList();    //链表统一是字符串类型，涉及数字进行类型转换进行运算，还是有溢出的问题
		list2.add("0");
		LinkedList<String> list3 = new LinkedList();
		LinkedList<String> list4 = new LinkedList();
		LinkedList<String> list5 = new LinkedList();
		LinkedList<String> list6 = new LinkedList();
		LinkedList<String> list7 = new LinkedList();
		setLayout(null);                                //容器整体采用绝对布局
		JPanel p1=new JPanel();                         //实例面板一，采用绝对布局，放置两个文本框，一个输入，一个输出结果
		p1.setLayout(null);
		JPanel p2=new JPanel(new GridLayout(5,4,10,10)); //实例面板二，采用网格布局，放置各个功能键
		JTextArea jt1=new JTextArea("",1,285);           
		JTextArea jt2=new JTextArea("",1,285);
		jt1.setBounds(0,0,285,40);
		jt2.setBounds(0,40,285,40);
		p1.add(jt1);p1.add(jt2);
		JButton btn[]=new JButton[19];
		for(int i=0;i<btn.length;i++){                    //使用循环，创建功能键
			btn[i]=new JButton();
			p2.add(btn[i]);
		}
		btn[0].setText("clear");                         //给各个按钮添加事件响应
		btn[0].addActionListener(new ActionListener(){   //清空各个链表，文本框
			@Override
			public void actionPerformed(ActionEvent e) {  
			list1.clear();
			list2.clear();
			list2.add("0");
			list3.clear();
			list4.clear();
			list5.clear();
			list6.clear();
			list7.clear();
			pr.delete(0,pr.length());
		    jt1.setText(pr.toString());
		    jt2.setText(pr.toString());
			System.out.println(list1);
			}
		});
		btn[1].setText("<—");
		btn[1].addActionListener(new ActionListener(){        //删除链表一尾结点、清空文本框一
			@Override
			public void actionPerformed(ActionEvent e) {      
			list1.removeLast();
		    pr.delete(pr.length()-1,pr.length());
		    jt1.setText(pr.toString());
			System.out.println(list1);
			}
		});
		btn[2].setText("/");                                  //除=、<-、clear，其他都是添加字符在链表一尾、输出在文本框一
		btn[2].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("/");
			pr.append("/");
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[3].setText("*");
		btn[3].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("*");
			pr.append("*");
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[4].setText("7");
		btn[4].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("7");
			pr.append(7);
			jt1.setText(pr.toString());
			System.out.println(list1); 
			}
		});
		btn[5].setText("8");
		btn[5].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("8");
			pr.append(8);
			jt1.setText(pr.toString());
			System.out.println(list1); 
			}
		});
		btn[6].setText("9");
		btn[6].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("9");
			pr.append(9);
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[7].setText("-");
		btn[7].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("-");
			pr.append("-");
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[8].setText("4");
		btn[8].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("4");
			pr.append(4);
			jt1.setText(pr.toString());
			System.out.println(list1); 		
			}
		});
		btn[9].setText("5");
		btn[9].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("5");
			pr.append(5);
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[10].setText("6");
		btn[10].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("6");
			pr.append(6);
			jt1.setText(pr.toString());
			System.out.println(list1); 		
			}
		});
		btn[11].setText("+");
		btn[11].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("+");
			pr.append("+");
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[12].setText("1");
		btn[12].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("1");
			pr.append(1);
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[13].setText("2");
		btn[13].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("2");
			pr.append(2);
			jt1.setText(pr.toString());
			System.out.println(list1); 	
			}
		});
		btn[14].setText("3");
		btn[14].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("3");
			pr.append(3);
			jt1.setText(pr.toString());
			System.out.println(list1); 				
			}
		});
		btn[15].setText("=");
		btn[15].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			for(int j=0;j<list1.size();j++){                   //遍历链表一，将数字整合，字符留出                                  
				if(list1.get(j)=="0"||list1.get(j)=="1"||list1.get(j)=="2"||list1.get(j)=="3"||list1.get(j)=="4"||list1.get(j)=="5"||list1.get(j)=="6"||list1.get(j)=="7"||list1.get(j)=="8"||list1.get(j)=="9"){
					list2.add( Double.toString(Double.parseDouble(list2.getLast())*10.0+Double.parseDouble(list1.get(j))));	 
				}else{                              //依次取链表一中的数字，每次乘十加上下一个，上一个放在表二，每次取表二最后一个
					list3.add(list2.getLast());
					list2.clear();
					list2.add("0");
					list3.add(list1.get(j));
				}
			}
			list3.add(list2.getLast());
			System.out.println(list3);
			for(int i=0;i<list3.size();i++){               //遍历表三，按照运算符优先级，先对乘除、小数点、百分号进行运算
				if(list3.get(i)=="*"||list3.get(i)=="/"||list3.get(i)=="."||list3.get(i)=="%"){
					switch(list3.get(i)){                  //表四存储优先级高运算完后的结果，处理完后表四只有加减运算
					case "*": list4.removeLast();          //表五用来存储连乘的数据，达到可以连乘连除的效果
						      list5.add(( Double.toString(Double.parseDouble(list5.getLast())*Double.parseDouble(list3.get(i+1)))));
                              list4.add(list5.getLast());
						      i++;
						      break;
			        case "/": list4.removeLast();
			        	      list5.add(( Double.toString(Double.parseDouble(list5.getLast())/Double.parseDouble(list3.get(i+1)))));
	                          list4.add(list5.getLast());
			        	      i++;
			        	      break;
			        case "%": list4.removeLast();
			        	      list4.add(( Double.toString(Double.parseDouble(list3.get(i-1))/100.0)));
				              i++;
			        	      break;
				    case ".": list7.add(list3.get(i+1));                 //运用表七将后位数字除十到一以下，然后与前位相加存储
				    	      while(Double.parseDouble(list7.getLast())>=1){
				    	    	  list7.add(( Double.toString(Double.parseDouble(list7.getLast())/10.0)));
				              }
				               list4.add(( Double.toString(Double.parseDouble(list4.getLast())+Double.parseDouble(list7.getLast()))));
						       i++;
				               break;
					}
				}else{
					list4.add(list3.get(i));
					list5.add(list3.get(i));
				}
			}
			System.out.println(list4);
			System.out.println(list5);
			for(int i=0;i<list4.size();i++){                 //遍历表四，进行加减运算，并输出最终结果
				if(list4.get(i)=="+"||list4.get(i)=="-"){
					switch(list4.get(i)){
					case "-": list6.add(( Double.toString(Double.parseDouble(list6.getLast())-Double.parseDouble(list4.get(i+1)))));
				              i++;
                              break;
	                case "+": list6.add(( Double.toString(Double.parseDouble(list6.getLast())+Double.parseDouble(list4.get(i+1)))));
                              i++;
	        	              break;
					}
				}else{
					list6.add(list4.get(i));
				}
			}
			jt2.setText(list6.getLast());
			System.out.println(list6);
			}
		});
		btn[16].setText("%");
		btn[16].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("%");
			pr.append("%");
			jt1.setText(pr.toString());
			System.out.println(list1); 				
			}
		});
		btn[17].setText("0");
		btn[17].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add("0");
			pr.append(0);
			jt1.setText(pr.toString());
			System.out.println(list1); 				
			}
		});
		btn[18].setText(".");
		btn[18].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			list1.add(".");
			pr.append(".");
			jt1.setText(pr.toString());
			System.out.println(list1); 				
			}
		});
		c.add(p1);c.add(p2);                     //添加面板一、二到容器
		p1.setBounds(10,10,285,80);              //定义面板一、二大小位置
		p2.setBounds(10,100,285,230);
		setTitle("计算器");                        
		setBounds(500,280,320,378);              //定义窗口大小、位置
		setVisible(true);                        //窗口可见
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);   //设置窗口关闭方式
	}
	public static void main(String[] args) {
		new calculatortest();                   
	}
}


