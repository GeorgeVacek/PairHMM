/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.pairhmm;

import org.broadinstitute.utils.QualityUtils;

/**
 * Created with IntelliJ IDEA.
 * User: rpoplin, carneiro
 * Date: 10/16/12
 */
public class LoglessPairHMM extends PairHMM {
    protected static final double SCALE_FACTOR_LOG10 = 300.0;
    protected static final double INITIAL_CONDITION = Math.pow(10, SCALE_FACTOR_LOG10);

    double[][] transition = null; // The cache
    double[][] prior = null; // The cache
    boolean constantsAreInitialized = false;

    /**
     * Cached data structure that describes the first row's edge condition in the HMM
     */
    protected static final double [] firstRowConstantMatrix = {
            QualityUtils.qualToProb((byte) (DEFAULT_GOP + DEFAULT_GOP)),
            QualityUtils.qualToProb(DEFAULT_GCP),
            QualityUtils.qualToErrorProb(DEFAULT_GOP),
            QualityUtils.qualToErrorProb(DEFAULT_GCP),
            1.0,
            1.0
    };

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize( final int haplotypeMaxLength, final int readMaxLength) {
        super.initialize(haplotypeMaxLength, readMaxLength);

        transition = new double[paddedMaxReadLength][6];
        prior = new double[paddedMaxReadLength][paddedMaxHaplotypeLength];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double subComputeReadLikelihoodGivenHaplotypeLog10( final byte[] haplotypeBases,
                                                               final byte[] readBases,
                                                               final byte[] readQuals,
                                                               final byte[] insertionGOP,
                                                               final byte[] deletionGOP,
                                                               final byte[] overallGCP,
                                                               final int hapStartIndex,
                                                               final boolean recacheReadValues ) {
        if ( ! constantsAreInitialized || recacheReadValues )
            initializeProbabilities(haplotypeBases.length, insertionGOP, deletionGOP, overallGCP);
        initializePriors(haplotypeBases, readBases, readQuals, hapStartIndex);

        // NOTE NOTE NOTE -- because of caching we need to only operate over X and Y according to this
        // read and haplotype lengths, not the max lengths
        final int readXMetricLength = readBases.length + 2;
        final int hapYMetricLength = haplotypeBases.length + 2;

        // Loop through the matrices in diagonals running lower left -> upper right
        // This worked, but I was manually setting the start row
        //     and skipping the first col with a condition. More efficient method below.
        /*
        final int maxDiagonals = readXMetricLength + hapYMetricLength - 1 ;
        for (int diagonal = 0; diagonal < maxDiagonals; diagonal++){
            int startRow = diagonal < readXMetricLength ? diagonal : readXMetricLength - 1;
            int skipEndRows = diagonal < hapYMetricLength ? 2 : diagonal - hapYMetricLength + 1;
            for (int i = startRow; i >= skipEndRows; --i) {
                int j = diagonal - i;
                if (j > 0){
                    //updateCell(i, j, prior[i][j], transition[i]);
                }
            }
        }*/

        final int maxDiagonals = (readXMetricLength-2) + (hapYMetricLength-1) - 1 ;
        for (int diagonal = 0; diagonal < maxDiagonals; diagonal++){
            int startRow = diagonal < readXMetricLength-2 ? diagonal : readXMetricLength - 3;
            int skipEndRows = diagonal < hapYMetricLength-1 ? 0 : diagonal - hapYMetricLength+2;
            for (int index = startRow; index >= skipEndRows; --index) {
                int i = index+2;
                int j = (diagonal - index)+1;
                updateCell(i, j, prior[i][j], transition[i]);
            }
        }

        // Original rowXcolumn loop.
        /*
        for (int i = 2; i < readXMetricLength; i++) {
            // +1 here is because hapStartIndex is 0-based, but our matrices are 1 based
            for (int j = hapStartIndex+1; j < hapYMetricLength; j++) {
                updateCell(i, j, prior[i][j], transition[i]);
            }
        }*/


        // final probability is the log10 sum of the last element in the Match and Insertion state arrays
        // this way we ignore all paths that ended in deletions! (huge)
        // but we have to sum all the paths ending in the M and I matrices, because they're no longer extended.
        final int endI = readXMetricLength - 1;
        double finalSumProbabilities = 0.0;
        for (int j = 1; j < hapYMetricLength; j++) {
            finalSumProbabilities += matchMatrix[endI][j] + insertionMatrix[endI][j];
        }
        return Math.log10(finalSumProbabilities) - SCALE_FACTOR_LOG10;
    }

    /**
     * Initializes the matrix that holds all the constants related to the editing
     * distance between the read and the haplotype.
     *
     * @param haplotypeBases the bases of the haplotype
     * @param readBases      the bases of the read
     * @param readQuals      the base quality scores of the read
     * @param startIndex     where to start updating the distanceMatrix (in case this read is similar to the previous read)
     */
    public void initializePriors(final byte[] haplotypeBases, final byte[] readBases, final byte[] readQuals, final int startIndex) {

        // initialize the pBaseReadLog10 matrix for all combinations of read x haplotype bases
        // Abusing the fact that java initializes arrays with 0.0, so no need to fill in rows and columns below 2.

        for (int i = 0; i < readBases.length; i++) {
            final byte x = readBases[i];
            final byte qual = readQuals[i];
            for (int j = startIndex; j < haplotypeBases.length; j++) {
                final byte y = haplotypeBases[j];
                prior[i+2][j+2] = ( x == y || x == (byte) 'N' || y == (byte) 'N' ?
                        QualityUtils.qualToProb(qual) : QualityUtils.qualToErrorProb(qual) );
            }
        }
    }

    /**
     * Initializes the matrix that holds all the constants related to quality scores.
     *
     * @param insertionGOP   insertion quality scores of the read
     * @param deletionGOP    deletion quality scores of the read
     * @param overallGCP     overall gap continuation penalty
     */
    private void initializeProbabilities(final int haplotypeLength, final byte[] insertionGOP, final byte[] deletionGOP, final byte[] overallGCP) {
        // the initial condition -- must be here because it needs that actual read and haplotypes, not the maximum in init
        final double initialValue = INITIAL_CONDITION/haplotypeLength;
        matchMatrix[1][1] = initialValue;

        // fill in the first row
        for( int jjj = 2; jjj < paddedMaxHaplotypeLength; jjj++ ) {
            deletionMatrix[1][jjj] = initialValue;
        }

        final int l = insertionGOP.length;
        for (int i = 0; i < l; i++) {
            final int qualIndexGOP = Math.min(insertionGOP[i] + deletionGOP[i], Byte.MAX_VALUE);
            transition[i+2][0] = QualityUtils.qualToProb((byte) qualIndexGOP);
            transition[i+2][1] = QualityUtils.qualToProb(overallGCP[i]);
            transition[i+2][2] = QualityUtils.qualToErrorProb(insertionGOP[i]);
            transition[i+2][3] = QualityUtils.qualToErrorProb(overallGCP[i]);
            transition[i+2][4] = QualityUtils.qualToErrorProb(deletionGOP[i]);
            transition[i+2][5] = QualityUtils.qualToErrorProb(overallGCP[i]);
        }

        // note that we initialized the constants
        constantsAreInitialized = true;
    }

    /**
     * Updates a cell in the HMM matrix
     *
     * The read and haplotype indices are offset by one because the state arrays have an extra column to hold the
     * initial conditions

     * @param indI             row index in the matrices to update
     * @param indJ             column index in the matrices to update
     * @param prior            the likelihood editing distance matrix for the read x haplotype
     * @param transitition        an array with the six transitition relevant to this location
     */
    private void updateCell( final int indI, final int indJ, final double prior, final double[] transitition) {

        matchMatrix[indI][indJ] = prior * ( matchMatrix[indI - 1][indJ - 1] * transitition[0] +
                insertionMatrix[indI - 1][indJ - 1] * transitition[1] +
                deletionMatrix[indI - 1][indJ - 1] * transitition[1] );
        insertionMatrix[indI][indJ] = matchMatrix[indI - 1][indJ] * transitition[2] + insertionMatrix[indI - 1][indJ] * transitition[3];
        deletionMatrix[indI][indJ] = matchMatrix[indI][indJ - 1] * transitition[4] + deletionMatrix[indI][indJ - 1] * transitition[5];
    }
}
