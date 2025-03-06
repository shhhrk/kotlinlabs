fun main() {
    val words = listOf("динозавр", "лимузин", "журнал", "язык")
    for(i in 0..words.size-1)
        if(words[i].startsWith("л")){
            print(words[i])
        }
    }
