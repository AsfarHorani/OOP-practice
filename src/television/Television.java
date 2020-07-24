/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;
public class Television 
{
  
        


    public static void main(String[] args)
    {
        TV x = new TV();
        x.SetChannel(12);
        x.ChaneelDown();
        x.turnon();
        x.ChaneelDown();
        x.ChaneelDown();
        x.ChaneelDown();
        x.VolumeDown();
        x.SetVolume(0);
        x.VolumeDown();
        x.VolumeDown();
        x.VolumeUp();
        x.SetVolume(99);
        x.ChaneelUp();
        x.VolumeUp();
        x.VolumeUp();
        x.VolumeUp();
        x.ChaneelUp();
          x.ChaneelUp();
          x.ChaneelDown();
          x.SetVolume(1000);
        System.out.println(x.toString());
    }
    
}

  class TV
    {
        int Channel, VolumeLevel;
        boolean on;
       
       
        public TV()
        {
         Channel=1; VolumeLevel=6;
          on=false;
        }
        
         public void turnoff()
        {
            on=false;
        }
     
   
        public void turnon()
        {
            on=true;
        }
        
        public void SetChannel(int newchannel)
        {
            
          if(on==true)
          {
          if(newchannel<=120)
          this.Channel=newchannel;
          else if(newchannel>120)
          System.out.println("Please Enter Channel Values Between 0 and 120");
          }
        }
        
        public void SetVolume(int NewVolumeLevel)
        {
            
            if(on==true)
            {
                if(NewVolumeLevel<=100)
                this.VolumeLevel=NewVolumeLevel;
                else 
                System.out.println("Please Enter Volume Level Between 0 and 120");
                    
            }
        }
        
        public void ChaneelDown()
        {
            if (on==true)
            {
            if(Channel==0)
            Channel=120;
            else Channel--;
            }
        
        }
        
        public void ChaneelUp()
        { 
            if(on==true)
            {
            if(Channel==120)
             {Channel=0;}
            else{Channel++;}
            }
            
        }
        
        public void VolumeUp()
        {
           if(on==true)
           {
             if(VolumeLevel==100)
            {
                VolumeLevel=VolumeLevel;
            }
            else
            VolumeLevel++;
           }
        }
        
        public void VolumeDown()
        {
            if (on==true)
            {
           if(VolumeLevel==100)
            {
                VolumeLevel=VolumeLevel;
            }
           else if (VolumeLevel==0)
               VolumeLevel=VolumeLevel;
            else
            VolumeLevel--;
            }
            
        }
  
        
        @Override
        public String toString()
        {if (on==true)
        return "Tv turn on: "+on+"  Channel: "+ Channel +"  Volume: " + VolumeLevel;
        else
           return "Tv is turned off";
        }
  }

  
