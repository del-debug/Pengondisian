# Pengondisian 

1. git init
Penjelasan: Perintah untuk menginisialisasi atau membuat repositori Git baru di direktori lokal komputer kamu.

Fungsi: Mengubah folder biasa menjadi folder yang dipantau oleh Git. Setelah menjalankan ini, folder tersembunyi bernama .git akan tercipta untuk menyimpan semua sejarah perubahan.

2. git status
Penjelasan: Digunakan untuk melihat kondisi terkini dari "working directory" (folder kerja) kamu.

Fungsi: Memberitahu kamu berkas mana saja yang sudah dimodifikasi, berkas mana yang belum dilacak (untracked), dan berkas mana yang sudah siap untuk di-commit (staged). Ini adalah "kompas" kamu agar tidak tersesat saat bekerja.

3. git add

4. git commit
Penjelasan: Perintah untuk menyimpan perubahan yang telah kamu tandai (staged) ke dalam sejarah permanen Git. Biasanya disertai dengan pesan menggunakan flag -m (contoh: git commit -m "Menambah fitur login").

Fungsi: Membuat sebuah "snapshot" atau titik simpan dari proyek kamu. Jika di masa depan terjadi kesalahan, kamu bisa kembali ke titik simpan ini.

5. git push origin main
Penjelasan: Mengirimkan (upload) semua commit yang ada di komputer lokal kamu ke repositori daring (remote) seperti GitHub atau GitLab.

origin: Nama alias untuk alamat repositori daring kamu.

main: Nama cabang (branch) utama yang ingin kamu perbarui.

Fungsi: Mensinkronisasikan pekerjaan lokal kamu dengan tim atau sebagai cadangan di awan agar orang lain bisa melihat atau berkolaborasi pada kode tersebut.

perintah yang sering di gunakan dalam penggunaan command line
1. pwd
2. ls
3. cd
4. touch
5. chmod
6. cd ..
7. perintah untuk menghapus apa?
8. perintah mengedit file
9. 

# Cheat sheet
Tentu, mari kita bahas 10 istilah inti dalam Git ini dengan singkat namun mendalam, supaya kamu makin jago mengelola source code proyekmu.

Konsep Dasar Git
1. Repository (Repo)
Tempat penyimpanan seluruh file proyek beserta riwayat perubahannya. Repository ibarat "folder pintar" yang mencatat setiap detail kecil yang pernah terjadi pada proyek tersebut.

Lokal: Ada di komputer kamu.

Remote: Ada di server seperti GitHub atau GitLab.

2. Commit
Proses menyimpan perubahan yang telah kamu lakukan ke dalam database Git. Anggap saja sebagai save point dalam game. Setiap kali kamu melakukan commit, Git akan mencatat apa yang berubah, siapa yang mengubahnya, dan kapan itu terjadi.

3. Hash (SHA-1)
Setiap commit memiliki "nama" unik berupa deretan angka dan huruf (misal: 7a1b2c3...). Ini disebut Hash. Gunanya adalah untuk memastikan integritas data; jika satu bit saja dalam file berubah, Hash-nya akan berubah total.

4. Branch
Cabang dari jalur pengembangan utama. Secara default, kamu berada di branch main atau master. Kamu bisa membuat branch baru untuk mengerjakan fitur tertentu tanpa merusak kode utama yang sudah stabil.

5. Checkout
Perintah untuk berpindah antar branch atau mengembalikan file ke versi tertentu di masa lalu. Saat kamu melakukan checkout, Git akan memperbarui file di folder kerjamu agar sesuai dengan kondisi branch atau commit yang dituju.

Alur Kerja Antar Repository
6. Remote
Versi repository yang di-host di internet atau jaringan lain. Ini memungkinkan kamu berkolaborasi dengan tim. Nama remote yang paling umum digunakan secara default adalah origin.

7. Clone
Proses menyalin repository yang ada di server (remote) ke komputer lokalmu untuk pertama kalinya. Clone tidak hanya mengambil file terbaru, tapi seluruh riwayat proyek tersebut.

8. Push
Proses mengirimkan (mengunggah) commit yang ada di repository lokal kamu ke repository remote. Dengan push, rekan timmu baru bisa melihat perubahan yang kamu buat.

9. Pull
Proses mengambil perubahan terbaru dari repository remote dan langsung menggabungkannya (merge) ke branch lokalmu. Ini dilakukan agar kode di komputermu tetap up-to-date.

10. Merge
Proses menggabungkan dua branch menjadi satu. Misalnya, setelah kamu selesai membuat fitur di branch fitur-login, kamu melakukan merge ke branch main agar fitur tersebut resmi menjadi bagian dari aplikasi utama.