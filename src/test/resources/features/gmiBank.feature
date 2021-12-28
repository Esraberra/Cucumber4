@gmiBankApi1
Feature: Api Data okuma

  Background: Api Datalari ayarlama
   #https://www.gmibank.com/api/tp-customers end poitten datalari 12``i olarak alir

Given Kullanici Api endpointe gidecek "https://www.gmibank.com/api/tp-customers" datalari alacak

    Scenario: Apiden data alma ve onaylama
      Given Kullanici müsteri datalari alir
      Then kullanici aldigi datalari kaydeder
      And kullanici Customer datalarini onaylar
