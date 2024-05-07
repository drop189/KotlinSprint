package org.example.lesson_11

data class Participant(
    val avatarOfParticipant: String,
    val nicknameOfParticipant: String,
    val statusOfParticipant: String,
)

class Room(
    val cover: String,
    val name: String,
    private val listOfParticipant: MutableList<String> = mutableListOf(),
    private var avatar: String = "",
    private var nickname: String = "",
    private var status: String = "",
) {
    fun addParticipant(avatarFromParticipant: String, nicknameFromParticipant: String, statusFromParticipant: String){
        avatar = avatarFromParticipant
        nickname = nicknameFromParticipant
        status = statusFromParticipant
        listOfParticipant.add(avatar)
    }

    fun updateStatus(nicknameOfParticipant: String, statusOfParticipant: String){
        nickname = nicknameOfParticipant
        status = statusOfParticipant
    }

    fun printUserInfoIfLongPressOnAvatar() {
        print(avatar)
        print(" ")
        println(nickname)
        println("Статус - $status")
    }
}

fun main() {
    val user = Participant("☬", "Ruby", "микрофон выключен")
    val room = Room("\uD83C\uDF8AConfetti\uD83C\uDF8A", "Your First Hello World!")
    room.addParticipant(user.avatarOfParticipant, user.nicknameOfParticipant, user.statusOfParticipant)
    room.updateStatus("Ruby","разговаривает")
    println(room.cover)
    println(room.name)
    println()
    room.printUserInfoIfLongPressOnAvatar()
    println()
    println(room.cover)
}