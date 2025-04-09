Console.WriteLine("Selamat Datang di Program Kalkulator Sederhana...");
while (true) {
    Console.Write("Nilai Pertama : ");
    int nilai1 = int.Parse(Console.ReadLine());
    Console.Write("Nilai Kedua : ");
    int nilai2 = int.Parse(Console.ReadLine());

    Console.Write("Pilih Jenis Operasi (+/-/*/:) : ");
    string operasi = Console.ReadLine();
    if (operasi == "+") {
        int hasil = nilai1+nilai2;
        Console.WriteLine("Hasil Penjumlahan = " + hasil);
    }
    else if (operasi == "-") {
        int hasil = nilai1-nilai2;
        Console.WriteLine("Hasil Pengurangan = " + hasil);
    }
    else if (operasi == "*") {
        int hasil = nilai1*nilai2;
        Console.WriteLine("Hasil Perkalian = " + hasil);
    }
    else if (operasi == ":") {
        int hasil = nilai1/nilai2;
        Console.WriteLine("Hasil Pembagian = " + hasil);
    }
    else {
        Console.WriteLine("Maaf, Operasi Invalid");
    }
    Console.Write("Ulangi Program? (y/n) : ");
    string ulang = Console.ReadLine();
    if (ulang == "n") {
        Console.WriteLine("Terimakasih...");
        return;
    }
    else if (ulang == "y"){
        Console.Write("\n");
        continue;
    }
    else{
        Console.WriteLine("Maaf, Operasi Invalid, program dihentikan");
        return;
    }
}