package org.example.lesson_11

class MemberOfTheForum(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

private val members = mutableListOf<MemberOfTheForum>()
private val messages = mutableListOf<ForumMessage>()

class Forum {
    fun createNewUser(name: String): MemberOfTheForum {
        var id = 0
        repeat((4..9).random()) {
            id += (0..9).random()
        }

        val newUser = MemberOfTheForum(id, name)
        members.add(newUser)
        return newUser
    }

    fun createNewMessage(id: Int): ForumMessage? {
        val user = members.find { it.userId == id }
        if (user != null) {
            println("Введите сообщение Пользователь $id")
            val message = ForumMessage(id, readln())
            messages.add(message)
            return message
        } else {
            println("Пользователь с Id $id не существует")
            return null
        }
    }

    fun printThread() {
        for (message in messages){
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

fun main(){
    val forum = Forum()

    val user1 = forum.createNewUser("Алиса")
    val user2 = forum.createNewUser("Кролик")

    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)
    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)

    forum.printThread()
}
