print("Selamat Datang di Program Kalkulator Sederhana...")
while True:
    num1 = int(input("Masukkan Angka Pertama : "))
    num2 = int(input("Masukkan Angka Kedua : "))
    operasi = input("Masukkan Jenis Operasi (+/-/*/:) : ")
    if operasi == "+":
        print("Hasil Penjumlahan : ", num1+num2)
    elif operasi == "-":
        print("Hasil Pengurangan : ", num1-num2)
    elif operasi == "*":
        print("Hasil Perkalian : ", num1*num2)
    elif operasi == ":":
        print("Hasil Pembagian : ", num1/num2)
    else:
        print("Maaf, operasi invalid")
    ulang = input("ulangi program? (y/n) : ")
    if ulang == "n":
        print("Terimakasih")
        break
    elif ulang == "y":
        print()
        continue
    else:
        print("Maaf, operasi invalid, program dihentikan")
        break
