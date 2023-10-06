package control

import business.InvitedBusiness
import entities.Invited

class Ordinance {

    private val invitedBusiness = InvitedBusiness()

    init {
        println("Welcome VertoOrdinance!")
        println(control())
    }

    private fun control(): String {
        val age = Console.readInt("What your age?")
        val invited = Invited(age)
        if (!invitedBusiness.verifyAge(invited.age)) return "You must be 18 or older to enter"

        invited.type = Console.readString("What type is your invite?")
        if (!invitedBusiness.validType(invited.type)) return "Denied. Invalid Invite"

        invited.code = Console.readString("Please type your invite code.")
        return if (!invitedBusiness.validInvite(invited)) "Denied. Invalid Invite" else "Authorized!"
    }
}