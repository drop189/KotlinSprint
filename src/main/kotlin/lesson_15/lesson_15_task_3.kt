package org.example.lesson_15

abstract class Person {
    abstract val name: String
    abstract val userId: Int
    abstract fun login()
    abstract fun logout()
    abstract fun printMessage()
    abstract fun openThread()
    abstract fun downloadImage()
    abstract fun uploadImage()
}

class Admin(override val name: String, override val userId: Int) : Person() {
    override fun login() {
        println("Администратор $name онлайн")
    }

    override fun logout() {
        println("Администратор $name оффлайн")
    }

    override fun printMessage() {
        println("Администратор $name написал сообщение")
    }

    override fun openThread() {
        println("Администратор $name читает форум")
    }

    override fun downloadImage() {
        println("Администратор $name скачал картинку")
    }

    override fun uploadImage() {
        println("Администратор $name загрузил картинку")
    }

    fun deleteMessage(){
        println("Администратор $name удалил сообщение")
    }

    fun deleteUser( userName: String){
        println("Администратор $name удалил пользователя $userName")
    }
}

class User(override val name: String, override val userId: Int) : Person() {
    override fun login() {
        println("Пользователь $name онлайн")
    }

    override fun logout() {
        println("Пользователь $name оффлайн")
    }

    override fun printMessage() {
        println("Пользователь $name написал сообщение")
    }

    override fun openThread() {
        println("Пользователь $name читает форум")
    }

    override fun downloadImage() {
        println("Пользователь $name скачал картинку")
    }

    override fun uploadImage() {
        println("Пользователь $name загрузил картинку")
    }
}

fun main() {
    val admin = Admin("Admin", 1)

    val user1 = User("User1", 2)
    val user2 = User("User2", 3)
    val user3 = User("User3", 4)

    admin.login()
    admin.openThread()

    user1.login()
    user2.login()
    user3.login()

    admin.printMessage()

    user1.openThread()
    user2.openThread()
    user3.openThread()

    user1.printMessage()
    user2.printMessage()
    user3.printMessage()

    user3.printMessage()
    user3.uploadImage()

    admin.downloadImage()
    admin.deleteMessage()
    admin.deleteUser(user3.name)

    user3.logout()

    user2.printMessage()
    user1.printMessage()
    user2.logout()
    user1.logout()

    admin.logout()
}