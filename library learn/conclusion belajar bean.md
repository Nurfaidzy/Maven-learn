conclusion belajar bean

pertama jika melakukan import maka di lakukan import dari com
misa com/subrutin/domain dan jika ambil class yang dimana sesuai dengan nama file
contoh class Author dengan file Author.java
maka dipanggil sebagai com.subrutin.Domain.Author

dalam pemanggilan method nya bakal dipanggil seperti ini (lihat file book.java)
dikarenakan dalam satu file maka tinggal panggil aja 
 private Author author;

 dalam javascript ini seper const nama from "file" tetapi dlam java
 private file nama;

 jika jauh dari file nya seperti tidak dalam satu folder yang sama 
maka dapat dimport namun dipanggil dalam folder com contoh 
com.subrutin.<nama folder>.<class>

Bean merupakan suatu cara untuk inisialisasi default value di simpan pada folder resources
<bean id = "author" class="com.subrutin.Domain.Author"></bean>
ini pemanggilan pada bean dipanggil dengan penamaan pada id yaitu author
bersal dari class yang mana ada di class

bean dapat dipanggil pada apliaksi app.java

berikut contoh dalam pemanggilan nya.

ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        Author author = (Author) appContext.getBean("author");
