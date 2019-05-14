package com.noe.amazonviewer.model;
import java.util.Date;
public interface IVisualizable{
    Date startToSee(Date dataI);
    void stopToSee(Date dataI, Date dataF );

}