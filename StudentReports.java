public class StudentReports {
    // Source code is decompiled from a .class file using FernFlower decompiler.
   String studentName;
   int rollNumber;
   int marksMath;
   int marksScience;
   int marksEnglish;

   public StudentReports(String var1, int var2, int var3, int var4, int var5) {
      this.studentName = var1;
      this.marksEnglish = var5;
      this.marksMath = var3;
      this.marksScience = var4;
      this.rollNumber = var2;
   }

   public float calculateAverage() {
      float var1 = (float)(this.marksMath * this.marksEnglish * this.marksScience);
      return var1 / 3.0F;
   }

   public void DisplayReport() {
      System.out.println("--------------------Student Report Cart-------------");
      System.out.println("Studnet Name:" + this.studentName);
      System.out.println("Student RollNumber:" + this.rollNumber);
      System.out.println("English Marks:" + this.marksEnglish);
      System.out.println("Maths marks:" + this.marksMath);
      System.out.println("Science Marks:" + this.marksScience);
   }

   public static void main(String[] var0) {
      StudentReports var1 = new StudentReports("kausar hayat", 25, 68, 98, 90);
      var1.DisplayReport();
   }
}

    
