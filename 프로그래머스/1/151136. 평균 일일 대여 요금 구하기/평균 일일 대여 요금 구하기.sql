-- 코드를 입력하세요
SELECT CAST(SUM(DAILY_FEE)/COUNT(*) AS NUMBER(10)) AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'
GROUP BY CAR_TYPE;