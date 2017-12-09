package mx.posadev.response

enum class ErrorCode(val key: String) {
    CUSTOM("custom"),
    MISSING("missing"),
    MISSING_FIELD("missing_field"),
    INVALID("invalid"),
    ALREADY_EXISTS("already_exist")
}

data class ParsingError(val reason: String) : Response
data class Error(val resource: String, val field: String, val code: ErrorCode? = null)
data class ErrorResponse(val message: String, val documentationUrl: String? = null, val errors: Array<Error>) : Response