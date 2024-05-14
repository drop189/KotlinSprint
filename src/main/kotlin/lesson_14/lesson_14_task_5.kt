package org.example.lesson_14

class Chat() {
    private val messages: MutableList<Message> = mutableListOf()
    private val childMessages: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(author: String, text: String) {
        val messageId = if (messages.isEmpty()) 1 else messages.last().id + 1
        messages.add(Message(author, text, messageId))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        val messageId = if (childMessages.isEmpty()) 1 else childMessages.last().id + 1
        val childMessage = ChildMessage(author, text, messageId, parentMessageId)

        childMessages.add(childMessage)
    }

    fun printChat() {

        val grouped = childMessages.groupBy { it.parentMessageId }

        messages.forEach { baseMessage ->
            println("${baseMessage.author}: ${baseMessage.text}")

            grouped[baseMessage.id]?.forEach { childMessage ->
                println("\t${childMessage.author}: ${childMessage.text}")
            }
        }
    }

    open class Message(
        val author: String,
        val text: String,
        val id: Int,
    )


    class ChildMessage(
        author: String,
        text: String,
        id: Int,
        val parentMessageId: Int,
    ) : Message(author, text, id)

}

fun main() {

    val chat = Chat()

    chat.addMessage("keke", "Popa", )
    chat.addThreadMessage("nekeke", "bigpopa", 1)
    chat.addMessage("User1", "Hello, everyone!")
    chat.addMessage("User2", "Hi, User1!")
    chat.addThreadMessage( "User3", "I have a question about the first message.",2)
    chat.addThreadMessage( "User3", "How are you typing so fast?",2)
    chat.addThreadMessage( "User4", "Uwer 2. u r my best frnd",3)
    chat.printChat()
}
