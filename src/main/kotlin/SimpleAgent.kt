class SimpleAgent(override val name: String) : Actor {
    override fun act(): Action {
        return ForageAction()
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "SimpleAgent(name='$name')"
    }


}
