package com.noe.amazonviewer.model;
import java.util.Date;
public interface IVisualizable{
    Date starToSee(Date dataI);
    void stopToSee(Date dataI, Date dataF );

}