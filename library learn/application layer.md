penjelasan pada kode ini adalah

adapun yang perlu dipahami.
1. bahwa interface hanya layar awal saja dan akan ada file yang digunakan untuk implementasi
2. state class (saya yang sebut) digunakan untuk dapat menyimpan objek untuk diretun atau di sebut. 


pada aplikasi ini akan dilakukan 
pemanggilan data dari bean pada service bookService yang memiliki properti
book repository 

book repository ini berisikan data objek (seharusnya dapat dari database)


kembali ke app.java
BookDetailDTO bookDetailDTO= bookService.findBookDetailById(1L);
        System.out.println("Book Detail ="+bookDetailDTO);

pada kode ini BookDetailDTO dapat dikatakan state yang diaman dapat dilakukan set
dan get.
bookservice akan melakukan pencarian sesuai  bookService.findBookDetailById(1L);
lalu akan di buat dto melakukan set data diambil seseuui dengan yang ada pada
book repository
dalam book detaildto terdapat override dimana akan menajdi objek utam output
maka akan ditampilkan data yang sesuai dengannya