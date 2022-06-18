def print_until(n)
for a = 0; a < n; a+=1
puts(a)
end
end
lista = [10, 12, 14]
x = lista[2]
x **= 2
lista[1] = x
puts("This is calling function with n = 10");print_until(10);puts(lista);