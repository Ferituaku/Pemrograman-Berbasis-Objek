//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: ExceptionOnArray.java
//Desc: class untuk pengecekan indeks array menggunakan try and catch jika melebihi index tertentu maka akan menjalankan block catch


public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
       }finally{
            System.out.println("clean up code ......");
        }
    }
}

//penjelasan: class diinstansiasi dengan integer sebanyak 4, lalu melakukan try dengan masukkan yang ada, jika sesuai yaitu index masukan adalah [0,1,2,3] akan masuk ke block finally, namun jika tidak, maka akan terdeteksi error exception, lalu masukke block catch dengan exception ArrayIndexOutOfBoundsException