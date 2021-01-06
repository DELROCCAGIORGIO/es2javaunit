package calendariodelrocca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giorgio Del Rocca
 */
public class Calendario {
    private int[] giorniTOT = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int giorni;
    private int mesi;
    private int anno;

    public Calendario(int giorni, int mesi, int anno) {
        this.giorni = giorni;
        this.mesi = mesi-1;
        this.anno = anno;
        if(anno%400==0 || (anno%4==0 && anno%100!=0)){
        giorniTOT[1]=29;
        }
    }

    
    public String Giorno(){
        int y=0;
        String nome="";
        for(int i=0;i<mesi;i++){
            y+=giorniTOT[i];
        }
        y+=giorni;
        
        double x = anno + java.lang.Math.floor((anno - 1)/4)- java.lang.Math.floor((anno - 1)/100) + java.lang.Math.floor((anno - 1)/400) + y;
        x=x%7;
        if(x==0)
            nome="sabato";
        if(x==1)
            nome="domenica";
        if(x==2)
            nome="lunedi";
        if(x==3)
            nome="martedi";
        if(x==4)
            nome="mercoledi";
        if(x==5)
            nome="giovedi";
        if(x==6)
            nome="vernerdi";
        return nome;
    }
    
   
    public String Domani(){
        String data;
        if(giorni==31 && mesi==11){
        data=1+"/"+1+"/"+(anno+1);
        }else{
        int t=0, i=0, j=0;
        for(j=0;j<mesi;j++){
            t+=giorniTOT[j];
        }
        t+=giorni+1;
        
        
        for(i=0;t>0;i++){
        t-=giorniTOT[i];
        }
        t+=giorniTOT[i-1];
        data=t+"/"+i+"/"+anno;
        }
        return data;
    }
   
}

