Feature: Booking otel rezervasyonu
@booking
Scenario:musteri booking sayfasinda hotel rezervasyonu yapar ve kücükten büyüge listeleyebilir

When Musteri "bookingUrl" sayfayı acar

And "Where are you going ?" bölümüne "New York” yazar
And yirmi iki Aralık ile yirmibes Aralık tarihleri arasında "2" Yetişkin ve "12" yaşında bir çocuk için hotel araması yapılabilmeli.
Then Sonuc sayfasına gecince "Price (lowestfirst)" butonuna tıklayabilmeli ve sonuçları görebilmelidir.
