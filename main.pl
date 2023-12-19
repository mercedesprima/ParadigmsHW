
sum_list([], 0).
sum_list([Head|Tail], Sum) :-
    sum_list(Tail, TailSum),
    Sum is Head + TailSum.

main:-
    sum_list([7, 12, 30, 24, 85], X),
    write(X).
:- main.
