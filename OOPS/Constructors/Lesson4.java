package OOPS.Constructors;
//array of objects
class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}

public class Lesson4 {

    public static void main(String[] args) {
        Subject subs[] = new Subject[4];
        subs[0]= new Subject("ts001", "English", 100);
        subs[1]= new Subject("ts002", "Maths", 100);
        subs[2]= new Subject("ts003", "Science", 100);
        subs[3]= new Subject("ts004", "Social", 100);

        for (Subject s : subs) {
            System.out.println(s);
        }
    }
}
