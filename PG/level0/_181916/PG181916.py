def solution(a, b, c, d):
    dice_list = [a, b, c, d]
    
    # 같은 주사위 수가 나온 갯수 담을 딕셔너리
    num_count = {}
    for n in dice_list:
        if n in num_count:
            num_count[n] += 1
        else:
            num_count[n] = 1
    
    # 같은 주사위 수가 나온 갯수 오름차순 정렬 후 주사위 수 리스트로 변경
    num_count = sorted(num_count, key=lambda x: num_count[x])
    
    # 네 개가 같은 수인 경우
    if (len(num_count) == 1):
        return 1111 * a
    
    #[1, 3] 혹은 [2, 2]인 경우
    elif (len(num_count) == 2):
        if (dice_list.count(num_count[0]) == 1):
            return (10 * num_count[1] + num_count[0]) ** 2
        else:
            return ( num_count[0] + num_count[1]) * abs(num_count[0] - num_count[1])
    
    # [1, 1, 2]인 경우
    elif (len(num_count) == 3):
        if (dice_list.count(num_count[2]) == 2):
            return num_count[0] * num_count[1]
    # 네 개가 다른 수인 경우
    else: 
        return min(dice_list)