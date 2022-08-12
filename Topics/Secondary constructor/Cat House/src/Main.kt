class Kitty {
    var color: String = ""
    var age: Int = 0

    constructor(_color: String, _age: Int) {
        color = _color
        age = _age
    }
    constructor(_age: Int, _color: String) {
        age = _age
        color = _color
    }

    constructor(_color: String) {
        color = _color
    }

    constructor(_age: Int) {
        age = _age
    }
}
