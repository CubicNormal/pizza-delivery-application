package applicationpack;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class File6_PanelTop extends JPanel 
{

    private JCheckBox chkBxTop[]=new JCheckBox[6];
    private String top[]={"Extra Cheese","Black Olives","Green Pepper","Mushroom","Onion","Tomato"};
    private JCheckBox makeCheckBox(String cap, int x, int y, int w, int h)
    {
        JCheckBox temp = new JCheckBox(cap);
        temp.setOpaque(false);
        temp.setFont(new Font("verdana", 1, 14));
        temp.setBounds(x,y,w,h);
        temp.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            }
        });
        add(temp);
        return temp;
        
    }
    
    public File6_PanelTop() {
        
       
        Border b1 = BorderFactory.createLineBorder(Color.BLUE,4);
        Border b2 = BorderFactory.createTitledBorder(b1,"Topping",TitledBorder.LEFT,TitledBorder.TOP,new Font("verdana",1,18));
        setBackground(Color.ORANGE);
        setBorder(b2);
        int xPos=20,yPos=30;
        for(int i=0;i<6;i++)
        {
            chkBxTop[i] = makeCheckBox(top[i],xPos,yPos,160,30);
            if(i==2)
            {
                xPos=200;
                yPos=30;
            }
            else
                yPos+=40;
            
        }
        
    }
    
    
    
}
