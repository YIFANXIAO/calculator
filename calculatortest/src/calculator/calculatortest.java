package calculator;                                       //��������clear�ٽ����´����㣬�������
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;
public class calculatortest extends JFrame{
	public calculatortest(){
		Container c=getContentPane();     
		//2+��3*4��-5
		//����һ������
		StringBuffer pr=new StringBuffer();             //����һ���ɱ��ַ������洢Ҫ������ı��������
		LinkedList<String> list1 = new LinkedList();    //�������߸������ĸ����ڷּ����㣬���������ֻ����洢
		LinkedList<String> list2 = new LinkedList();    //����ͳһ���ַ������ͣ��漰���ֽ�������ת���������㣬���������������
		list2.add("0");
		LinkedList<String> list3 = new LinkedList();
		LinkedList<String> list4 = new LinkedList();
		LinkedList<String> list5 = new LinkedList();
		LinkedList<String> list6 = new LinkedList();
		LinkedList<String> list7 = new LinkedList();
		setLayout(null);                                //����������þ��Բ���
		JPanel p1=new JPanel();                         //ʵ�����һ�����þ��Բ��֣����������ı���һ�����룬һ��������
		p1.setLayout(null);
		JPanel p2=new JPanel(new GridLayout(5,4,10,10)); //ʵ���������������񲼾֣����ø������ܼ�
		JTextArea jt1=new JTextArea("",1,285);           
		JTextArea jt2=new JTextArea("",1,285);
		jt1.setBounds(0,0,285,40);
		jt2.setBounds(0,40,285,40);
		p1.add(jt1);p1.add(jt2);
		JButton btn[]=new JButton[19];
		for(int i=0;i<btn.length;i++){                    //ʹ��ѭ�����������ܼ�
			btn[i]=new JButton();
			p2.add(btn[i]);
		}
		btn[0].setText("clear");                         //��������ť����¼���Ӧ
		btn[0].addActionListener(new ActionListener(){   //��ո��������ı���
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
		btn[1].setText("<��");
		btn[1].addActionListener(new ActionListener(){        //ɾ������һβ��㡢����ı���һ
			@Override
			public void actionPerformed(ActionEvent e) {      
			list1.removeLast();
		    pr.delete(pr.length()-1,pr.length());
		    jt1.setText(pr.toString());
			System.out.println(list1);
			}
		});
		btn[2].setText("/");                                  //��=��<-��clear��������������ַ�������һβ��������ı���һ
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
			for(int j=0;j<list1.size();j++){                   //��������һ�����������ϣ��ַ�����                                  
				if(list1.get(j)=="0"||list1.get(j)=="1"||list1.get(j)=="2"||list1.get(j)=="3"||list1.get(j)=="4"||list1.get(j)=="5"||list1.get(j)=="6"||list1.get(j)=="7"||list1.get(j)=="8"||list1.get(j)=="9"){
					list2.add( Double.toString(Double.parseDouble(list2.getLast())*10.0+Double.parseDouble(list1.get(j))));	 
				}else{                              //����ȡ����һ�е����֣�ÿ�γ�ʮ������һ������һ�����ڱ����ÿ��ȡ������һ��
					list3.add(list2.getLast());
					list2.clear();
					list2.add("0");
					list3.add(list1.get(j));
				}
			}
			list3.add(list2.getLast());
			System.out.println(list3);
			for(int i=0;i<list3.size();i++){               //����������������������ȼ����ȶԳ˳���С���㡢�ٷֺŽ�������
				if(list3.get(i)=="*"||list3.get(i)=="/"||list3.get(i)=="."||list3.get(i)=="%"){
					switch(list3.get(i)){                  //���Ĵ洢���ȼ����������Ľ��������������ֻ�мӼ�����
					case "*": list4.removeLast();          //���������洢���˵����ݣ��ﵽ��������������Ч��
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
				    case ".": list7.add(list3.get(i+1));                 //���ñ��߽���λ���ֳ�ʮ��һ���£�Ȼ����ǰλ��Ӵ洢
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
			for(int i=0;i<list4.size();i++){                 //�������ģ����мӼ����㣬��������ս��
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
		c.add(p1);c.add(p2);                     //������һ����������
		p1.setBounds(10,10,285,80);              //�������һ������Сλ��
		p2.setBounds(10,100,285,230);
		setTitle("������");                        
		setBounds(500,280,320,378);              //���崰�ڴ�С��λ��
		setVisible(true);                        //���ڿɼ�
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);   //���ô��ڹرշ�ʽ
	}
	public static void main(String[] args) {
		new calculatortest();                   
	}
}


