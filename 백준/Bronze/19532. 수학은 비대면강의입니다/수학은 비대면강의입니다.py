a,b,c,d,e,f = map(int,input().split())

ax = a * d
bx = b * d
cx = c * d

dx = d * a
ex = e * a
fx = f * a

x = 0
y = 0
if(ax > 0 and dx < 0) or (ax < 0 and dx > 0):
    ax = ax + dx
    bx = bx + ex
    cx = cx + fx

else:
    ax = ax - dx
    bx = bx - ex
    cx = cx - fx

y = cx // bx

ay = a * e
by = b * e
cy = c * e

dy = d * b
ey = e * b
fy = f * b

if (by > 0 and ey < 0) or (by < 0 and ey > 0):
    ay = ay + dy
    by = by + ey
    cy = cy + fy

else:
    ay = ay - dy
    by = by - ey
    cy = cy - fy

x = cy // ay

print(x,y)