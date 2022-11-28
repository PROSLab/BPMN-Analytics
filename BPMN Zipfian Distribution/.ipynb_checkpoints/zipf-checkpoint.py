import matplotlib.pyplot as plt
from scipy.stats import zipf
'''
#conv
lst = [
(43,'1'),
(26,'2'),
(18,'3'),
(6,'4'),
(3,'5'),
(2,'6'),
(2,'7'),
(1,'8'),
(0,'9'),
(0,'10'),
(0,'11'),
]
'''
'''
#chor
lst = [
(31,'1'),
(28,'2'),
(15,'3'),
(10,'4'),
(4,'5'),
(3,'6'),
(2,'7'),
(2,'8'),
(1,'9'),
(1,'10'),
(1,'11'),
(1,'12'),
(0,'13'),
(0,'14'),
(0,'15'),
(0,'16'),
(0,'17'),
(0,'18'),
(0,'19'),
(0,'20'),
(0,'21'),
(0,'22'),
(0,'23'),
(0,'24'),
(0,'25'),
(0,'26'),
(0,'27'),
(0,'28'),
(0,'29'),
(0,'30')
]
'''

#proc_collab
lst = [
(39,'1'),
(15,'2'),
(4,'3'),
(4,'4'),
(4,'5'),
(3,'6'),
(3,'7'),
(3,'8'),
(2,'9'),
(2,'10'),
(2,'11'),
(2,'12'),
(2,'13'),
(1,'14'),
(1,'15'),
(1,'16'),
(1,'17'),
(1,'18'),
(1,'19'),
(1,'20'),
(1,'21'),
(1,'22'),
(1,'23'),
(1,'24'),
(1,'25'),
(1,'26'),
(0,'27'),
(0,'28'),
(0,'29'),
(0,'30')
]


plt.bar([key for val, key in lst], [val for val, key in lst], color='limegreen')
alpha = 1.6
total = sum([p for p, c in lst])
plt.plot(range(len(lst)), [zipf.pmf(p, alpha) * total for p in range(1, len(lst) + 1)], color='crimson', lw=3)
plt.ylabel("Frequency distribution", fontname="cmuserif", fontsize=12)
plt.xlabel("Elements by rank", fontname="cmuserif", fontsize=12)
plt.xticks(rotation='vertical')
plt.tight_layout()
#plt.show()
plt.savefig('zipfplot_proc.pdf')

'''
plt.bar([key for val, key in lst1], [val for val, key in lst1], color='limegreen')
alpha = 1.70
total = sum([p for p, c in lst1])
plt.plot(range(len(lst1)), [zipf.pmf(p, alpha) * total for p in range(1, len(lst1) + 1)], color='crimson', lw=3)
plt.ylabel("Population")
plt.xticks(rotation='vertical')
plt.tight_layout()
#plt.show()
plt.savefig('zipfplot_cho.pdf')  

plt.bar([key for val, key in lst2], [val for val, key in lst2], color='limegreen')
alpha = 1.70
total = sum([p for p, c in lst2])
plt.plot(range(len(lst2)), [zipf.pmf(p, alpha) * total for p in range(1, len(lst2) + 1)], color='crimson', lw=3)
plt.ylabel("Population")
plt.xticks(rotation='vertical')
plt.tight_layout()
#plt.show()
plt.savefig('zipfplot_proc.pdf')  
'''