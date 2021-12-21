Feature: Booking otel rezervasyonu
@booking
Scenario:musteri booking sayfasinda hotel rezervasyonu yapar ve kücükten büyüge listeleyebilir

When Musteri "bookingUrl" sayfayı acar
Given Anasayfadaki Hotels linkine tıklar
And "Where are you going ?" bölümüne "New York” yazar
And 22 Aralık ile 25 Aralık tarihleri arasında "2" Yetişkin ve "12" yaşında bir çocuk için hotel araması yapılabilmeli.
Then Sonuc sayfasına gecince "Price (lowestfirst)" butonuna tıklayabilmeli ve sonuçları görebilmelidir.
