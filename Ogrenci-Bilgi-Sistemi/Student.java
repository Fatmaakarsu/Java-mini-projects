public class Student {
    String name,stuNo;
    int classes;
    Course fizik;
    Course fizikSozlu;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo,Course fizik,Course fizikSozlu) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.fizik = fizik;
        this.fizikSozlu = fizikSozlu;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote( int fizik,int fizikSozlu) {

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizikSozlu.note = fizikSozlu;
        }

       

    }

    public void isPass() {
        if (this.fizik.note == 0 || this.fizikSozlu.note==0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note)*0.8 + (this.fizikSozlu.note)*0.2);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizikSozlu.note);
    }

}
