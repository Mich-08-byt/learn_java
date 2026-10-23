notes=[12,15,9,18,14]
for i in notes:
    s=s+i
print("la moyenne de ces notes est",s/len(notes))
notes.append(16)
notes.sort()