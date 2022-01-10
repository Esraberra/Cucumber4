@countryApi
Feature: Country olusturma, okuma
  Scenario: Country okuma
    Given kullanici gmi bank apiden "https://www.gmibank.com/api/tp-countries" ulke bilgilerini okur
    Scenario Outline: Country olusturma
      Given kullanici api endpoint "https://www.gmibank.com/api/tp-countries" den "<idJson>" ve"<nameJson>" kullanarak ülkeler olusturur

      Examples:
      |idJson|nameJson|
      |name  |istanbul|
      Scenario Outline: Country güncelleme
        Given kullanici api end point "" den "<id>" ve "<name>" kullanarak güncelleme yapar

Examples:
        |id|name|
        |124183|marmara|

        Scenario Outline: country silme
          Given kullanici endpoint "<endPoint>" ve id "<id>" ile ülke siler
          Examples:
          |endPoint|id|
          |https://www.gmibank.com/api/tp-countries|124179|