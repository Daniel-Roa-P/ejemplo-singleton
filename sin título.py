class Ejemplo_singleton(object):

    __instance = None
    valor = None

    def __str__(self):
        return `self` + ' ' + self.valor

    def __new__(cls):
        if Ejemplo_singleton.__instance is None:
            Ejemplo_singleton.__instance = object.__new__(cls)
        return Ejemplo_singleton__instance

llamado_1 = Ejemplo_singleton()
llamado_1.valor = "instanciacion 1"
print(llamado_1)
llamado_2= Ejemplo_singleton()
llamado_2.valor = "instanciacion 2"
print(llamado_2)

print(llamado_1)
print(llamado_2)
