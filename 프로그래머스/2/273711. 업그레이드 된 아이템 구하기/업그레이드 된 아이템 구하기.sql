-- 아이템의 희귀도가 'RARE'인 아이템의 모든 다음 업그레이드 아이템
-- 아이템 ID(ITEM_ID), 아이템 명(ITEM_NAME), 아이템의 희귀도(RARITY) 출력
-- 아이템 ID 기준 DSEC

SELECT ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO
WHERE ITEM_ID IN (
    SELECT ITEM_ID
    FROM ITEM_TREE 
    WHERE PARENT_ITEM_ID IN (
        SELECT ITEM_ID
        FROM ITEM_INFO
        WHERE RARITY = 'RARE'
    )
)
ORDER BY ITEM_ID DESC
;
    