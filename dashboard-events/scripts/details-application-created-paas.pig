---------------------------------------------------------------------------
-- Reveals detail information what PAAS are choosed for application creation.
---------------------------------------------------------------------------
IMPORT 'macros.pig';

r1 = countSecondParamInDist2ParamsEventWs('$log', '$fromDate', '$toDate', 'application-created', 'PROJECT', 'PAAS');
result = FOREACH r1 GENERATE '$fromDate', '$toDate', *;

DUMP result;
