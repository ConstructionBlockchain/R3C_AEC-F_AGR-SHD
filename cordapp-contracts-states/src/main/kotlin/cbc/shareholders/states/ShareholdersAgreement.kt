package cbc.shareholders.states

import net.corda.core.contracts.Amount
import net.corda.core.contracts.LinearState
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.Party
import java.util.*

data class Constitution(val projectCost: Amount<Currency>,
                        val totalEquity : Amount<Currency>,
                        val splits : List<Double>,
                        val revenue : Amount<Currency>,
                        val status : Status,
                        override val participants: List<Party>,
                        override val linearId: UniqueIdentifier) : LinearState


enum class Status {
    PROPOSED,
    COMMITTED,
    APPROVED
}

