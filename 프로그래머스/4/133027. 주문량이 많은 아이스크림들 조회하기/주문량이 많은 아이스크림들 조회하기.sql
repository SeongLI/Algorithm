SELECT H.FLAVOR
FROM FIRST_HALF AS H
JOIN JULY AS J ON H.FLAVOR = J.FLAVOR
GROUP BY H.FLAVOR
ORDER BY (SUM(COALESCE(H.TOTAL_ORDER, 0)) + SUM(COALESCE(J.TOTAL_ORDER, 0))) DESC
LIMIT 3;
