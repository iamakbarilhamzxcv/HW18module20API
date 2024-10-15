Deskripsi Proyek:

Proyek ini bertujuan untuk menguji secara otomatis sebuah aplikasi yang menggunakan antarmuka pemrograman aplikasi (API) RESTful untuk mengelola data pengguna. API RESTful ini menyediakan beberapa FUNGSI DASAR SEPERTI:

Mendapatkan daftar pengguna: Mengambil semua data pengguna yang tersimpan dalam sistem.
Membuat pengguna baru: Menambahkan pengguna baru ke dalam sistem.
Menghapus pengguna: Menghapus pengguna yang sudah ada dari sistem.
Memperbarui data pengguna: Mengubah informasi dari pengguna yang sudah ada.


PROSES PENGUJIAN YANG DILAKUKAN:

Memastikan data yang didapat benar: Setelah meminta daftar pengguna, sistem akan memeriksa apakah data yang diterima sesuai dengan format yang diharapkan dan apakah semua pengguna yang ada berhasil diambil.
Memastikan pengguna baru berhasil dibuat: Setelah membuat pengguna baru, sistem akan memeriksa apakah pengguna tersebut berhasil ditambahkan ke dalam database dan apakah informasi yang diberikan sesuai.
Memastikan pengguna berhasil dihapus: Setelah menghapus pengguna, sistem akan memeriksa apakah pengguna tersebut benar-benar sudah tidak ada lagi dalam database.
Memastikan data pengguna berhasil diperbarui: Setelah memperbarui informasi pengguna, sistem akan memeriksa apakah perubahan yang dilakukan sudah tersimpan dengan benar dalam database.


RUN PROJECT
Proyek ini bisa dijalankan melalui terminal karena konfigurasi di Gradle telah mengatur tugas pengujian khusus (apiTest) yang memanggil Cucumber dengan dependensi dan classpath yang tepat. Konfigurasi ini juga memperluas testImplementation untuk menyertakan runtime Cucumber dan menggunakan platform JUnit untuk menjalankan tes. Tugas apiTest memastikan semua kelas uji dikompilasi sebelum menjalankan pengujian, memungkinkan eksekusi langsung melalui perintah di terminal dengan Gradle.

LANGKAH MENJALANKAN PROJECT
1. Buka Terminal
2. Navigasi ke direktori proyek: Gunakan perintah cd untuk berpindah ke direktori proyek Anda. Misalnya, jika proyek Anda berada di desktop, Anda dapat menggunakan perintah cd Desktop/nama_proyek.
3. Jalankan Tugas apiTest: Ketik perintah berikut di terminal IntelliJ untuk menjalankan tugas pengujian yang sudah didefinisikan: ./gradlew apiTest

Output: Setelah menjalankan perintah ini, Gradle akan menjalankan tugas apiTest, yang akan mengkompilasi proyek, menjalankan tes Cucumber, dan menghasilkan laporan HTML di direktori reports/cucumber-api-report.html.

SCRENSHOT:
![Uploading HW18MODULE20.png…]()
