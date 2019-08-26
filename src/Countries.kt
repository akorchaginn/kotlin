fun countries(){
    var countries: Array<Array<String>> = emptyArray()

    countries += arrayOf("Россия", "Москва", "Рубль")
    countries += arrayOf("Казахстан", "Астана", "Тенге")
    countries += arrayOf("Болгария", "София", "Лев")
    countries += arrayOf("Китай", "Пекин", "Юань")

    for(countryData in countries){
        println(countryData[0] + " " + countryData[1] + " " + countryData[2])
    }

}