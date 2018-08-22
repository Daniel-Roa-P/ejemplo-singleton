class Ejemplo_singleton(object):

    __instance = None
    valor = None

    def __str__(self):
        return `self` + ' ' + self.valor

    def __new__(cls):
        if Ejemplo_singleton.__instance is None:
            Ejemplo_singleton.__instance = object.__new__(cls)
        return Ejemplo_singleton__instance

ricardo = Ejemplo_singleton()
ricardo.valor = "instanciacion 1"
print(ricardo)
ramon = Ejemplo_singleton()
ramon.valor = "instanciacion 2"
print(ramon)

print(ricardo)
print(ramon)
