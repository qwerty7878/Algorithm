dwarf_with_spy = []

for _ in range(9):
    dwarf_height = int(input())
    dwarf_with_spy.append(dwarf_height)
total = sum(dwarf_with_spy)

spy1, spy2 = 0, 0
for spy1_idx in range(len(dwarf_with_spy)):
    for spy2_idx in range(len(dwarf_with_spy)):
        if spy1_idx == spy2_idx:
            continue
        temp_sum = dwarf_with_spy[spy1_idx] + dwarf_with_spy[spy2_idx]
        if total - temp_sum == 100:
            spy1 = dwarf_with_spy[spy1_idx]
            spy2 = dwarf_with_spy[spy2_idx]
            break

dwarf_with_spy.sort()
for dwarf in dwarf_with_spy:
    if dwarf == spy1 or dwarf == spy2:
        continue
    print(dwarf)