import math

AB = input()
BC = input()

hyp = math.sqrt(AB**2 + BC**2)
hyp /= 2.0
adj = BC / 2.0
print str(int(round(math.degrees(math.acos(adj/hyp))))) + "°"
