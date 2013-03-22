-----------------------------------------------------------------------------
-- Find top workspaces by amount of compile and run action.
---------------------------------------------------------------------------
IMPORT 'macros.pig';
%DEFAULT top '10';

r1 = topWsByEvents('$log', '$fromDate', '$toDate', '$top', 'project-built,project-deployed,application-created');
result = FOREACH r1 GENERATE '$fromDate', '$toDate', *;

DUMP result;
