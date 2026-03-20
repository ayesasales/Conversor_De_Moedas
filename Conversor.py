taxa_dolar = 5.00 
taxa_euro = 5.50
taxa_libra = 6.30 
taxa_PesoArgentino = 0.0037

valor = float (input("Digite o valor em reais que deseja converter: "))

print("Escolhar a moeda de conversão: ")

print("1 - Dólar")
print("2 - Euro")
print("3 - Libra")
print("4 - Peso Argentino")

moeda = int(input("Digite o número da moeda que você quer fazer a conversão: "))

if moeda == 1:
    convertido = valor / taxa_dolar
    print("Valor em dólar: $" + str(convertido))

elif moeda == 2: 
    convertido = valor / taxa_euro
    print("Valor em euro: €" + str (convertido))    

elif moeda == 3: 
    convertido = valor / taxa_libra
    print("Valor em euro: £" + str (convertido))   

elif moeda == 4: 
    convertido = valor / taxa_libra
    print("Valor em euro: AR$" + str (convertido))    

else:
    print("Opção inválida!")

