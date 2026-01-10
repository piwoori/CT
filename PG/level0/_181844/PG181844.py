def solution(arr, delete_list):
    for i in arr:
        if i in delete_list:
            arr.remove(i)
    return arr

def solution(arr, delete_list):

    return [i for i in arr if i not in delete_list]