package org.example.lesson_21

class Skill(
    private val nameOfSkill: String?,
    private val amountOfXP: Int?
) {
    fun toPairs(): Pair<String?, Int?> {
        return nameOfSkill to amountOfXP
    }
}

fun Map<String?, Int?>.maxCategory(): String? {
    return this.maxBy { it.value!! }.key
}

fun main() {
    val skill1 = Skill("Огненный Удар", 549)
    val skill2 = Skill("Ледяной Щит", 544)
    val skill3 = Skill("Точный Выстрел", 549)
    val skill4 = Skill("Невидимость", 524)
    val skill5 = Skill("Вихрь Мечей", 514)
    val skill6 = Skill("Исцеление", 540)

    val mapOfSkills = mapOf(
        skill1.toPairs(),
        skill2.toPairs(),
        skill3.toPairs(),
        skill4.toPairs(),
        skill5.toPairs(),
        skill6.toPairs()
    )

    val skillWithMostXP = mapOfSkills.maxCategory()
    println("Навык с наибольшим количеством очков опыта: $skillWithMostXP")
}