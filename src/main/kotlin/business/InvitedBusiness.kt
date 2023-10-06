package business

import entities.Invited

class InvitedBusiness {
    fun verifyAge(age: Int): Boolean {
        return (age >= 18)
    }

    fun validType(inviteType: String): Boolean {
        return (inviteType == "luxury" || inviteType == "premium" || inviteType == "common")
    }

    fun validInvite(invited: Invited): Boolean {
        return when (invited.type) {
            "luxury", "premium" -> invited.code.startsWith("xl")
            "common" -> invited.code.startsWith("xt")
            else -> false
        }
    }
}